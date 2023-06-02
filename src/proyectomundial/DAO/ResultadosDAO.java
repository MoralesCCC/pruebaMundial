package proyectomundial.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import proyectomundial.model.Resultados;
import proyectomundial.util.BasedeDatos;
import static proyectomundial.util.BasedeDatos.ejecutarSQL;

public class ResultadosDAO {

    public ResultadosDAO() {
        BasedeDatos.conectar();
    }
    
    public List<Resultados> buscarResultandos(String Grupo) {
        String sql = "SELECT DISTINCT Grupo, Local, Visitante, Continente_local, Continente_visitane, Goles_local, Goles_visitante FROM b_bautista4.seleccion WHERE LOWER(nombre) = LOWER('" + Grupo + "');";
        
        List<Resultados> Resultados = new ArrayList<Resultados>();
        
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            
            if(result != null) {
            
                while (result.next()) { 
                    Resultados resultados= new Resultados(result.getString("Grupo"), result.getString("Local"), result.getString("Visitante"), result.getString("Continente_local")result.getString("Continente_visitante"), result.getint("Goles_local"), result.getint("goles_visitante"), result.getString("Continente_local"));
                    resultados.add(resultados);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error consultando selecciones");
        }
        
        return Resultados;
    }
    
    public boolean registrarSeleccion(Resultados resultados) {
        
        String sql = "INSERT INTO b_bautista4.seleccion (Grupo, Local, Visitante, Continente_local, Continente_visitane, Goles_local, Goles_visitante) values("
                + "'" + resultados.getGrupo() + "', " 
                + "'" + resultados.getLocal() + "', " 
                + "'" + resultados.getVisitante() + "', " 
                + "'" + resultados.getContinente_local()+ "', "
                + "'" + resultados.getContinente_visitane()+ "', " 
                + "'" + resultados.getGoles_local()+ "', "
                + "'" + resultados.getGoles_visitante()+ "',)";
                
        
        //BasedeDatos.conectar();
        boolean registro = BasedeDatos.ejecutarActualizacionSQL(sql);
        //BasedeDatos.desconectar();
        return registro;
    }
    
    public List<Resultados> getResultados() {
        
        String sql = "SELECT nombre, continente, dt, nacionalidad FROM b_bautista4.seleccion";
        List<Resultados> selecciones = new ArrayList<Resultados>();
        
        try {
            ResultSet result = BasedeDatos.ejecutarSQL(sql);
            
            if(result != null) {
            
                while (result.next()) { 
                    Resultados seleccion = new Resultados(result.getString("nombre"), result.getString("continente"), result.getString("dt"), result.getString("nacionalidad"));
                    selecciones.add(seleccion);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Error consultando selecciones");
        }
        
        return Resultados;
    }
    
    
    public String[][] getResultadosMatriz() {
        
        String[][] matrizSelecciones = null;
        List<Resultados> selecciones = getResultados();
        
        
        if(selecciones != null && selecciones.size() > 0) {
            
        
            matrizSelecciones = new String[selecciones.size()][4];

            int x = 0;
            for (Resultados resultados : resultados) {

                matrizSelecciones[x][0] = resultados.getGrupo();
                matrizSelecciones[x][1] = resultados.getLocal();
                matrizSelecciones[x][2] = resultados.getVisitante();
                matrizSelecciones[x][3] = resultados.getContinente_local();
                matrizSelecciones[x][4] = resultados.getContinente_visitane();
                
                
                x++;
            }
        }
        
        return matrizSelecciones;
    }
    
    public String[][] getSeleccionesMatriz(String dato) {
        
        String[][] matrizSelecciones = null;
        List<Seleccion> selecciones = buscarSelecciones(dato);
        
        
        if(selecciones != null && selecciones.size() > 0) {
            
        
            matrizSelecciones = new String[selecciones.size()][4];

            int x = 0;
            for (Seleccion seleccion : selecciones) {

                matrizSelecciones[x][0] = seleccion.getNombre();
                matrizSelecciones[x][1] = seleccion.getContinente();
                matrizSelecciones[x][2] = seleccion.getDt();
                matrizSelecciones[x][3] = seleccion.getNacionalidad();
                x++;
            }
        }
        
        return matrizSelecciones;
    }
}
