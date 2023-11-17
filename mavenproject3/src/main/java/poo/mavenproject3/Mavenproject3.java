/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.mavenproject3;

/**
 *
 * @author LAURA
 */

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.LinkedList;
import java.util.Date;

public class Mavenproject3 {
    public static void main(String[] args) {
        
        // Esto nos sirve para generar un formato json para retornar la data del array
        // sin tener que acomodarla bonita de manera manual
        Gson gson = new Gson();
        
        Date fecha = new Date();
        
        LinkedList<Vehiculo> automoviles = new LinkedList<>();
        LinkedList<Motocicleta> motos = new LinkedList<>();
        
        // Automovil creado por defecto
        Automovil auto = new Automovil(4, "Mazda", "3", "ZYX987", (fecha.getHours() + ":" + fecha.getMinutes()));
        automoviles.add(auto);
        
        Motocicleta moto = new Motocicleta(600,"Honda", "CBR600", "XYZ789",(fecha.getHours() + ":" + fecha.getMinutes()));
        
        // Agregar la motocicleta a la lista de automoviles
        automoviles.add(moto);
        
        // Definir endpoints
        
        // Por defecto 
        get("/motocicleta", (req, res) -> {
            res.type("application/json");
            return gson.toJson(moto);
        });
        
        // Listado de automoviles
        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });

        // Guardar automovil
        // endpoint GET para agregar un automóvil
        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // No olvidar convertir en integer los string numéricos que llegan por URL
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));
            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");

            // Crear un nuevo automóvil y agregarlo al parqueadero
            Automovil carro1 = new Automovil(4, "Mazda", "3", "ZYX987", (fecha.getHours() + ":" + fecha.getMinutes()));
            automoviles.add(carro1);

            return gson.toJson(carro1);
        });
        
        get("/motos", (req, res) -> {
        res.type("application/json");
        return gson.toJson(motos);
        });
        
        // Endpoint para obtener la lista de motocicletas
        get("/motos", (req, res) -> {
        res.type("application/json");
        return gson.toJson(motos);
        });

        // Endpoint para agregar una motocicleta con parámetros desde la URL
        get("/agregarMoto/:marca/:modelo/:placa/:cilindrada", (req, res) -> {
        res.type("application/json");

        Date nuevaFecha = new Date();
        String marca = req.params(":marca");
        String modelo = req.params(":modelo");
        String placa = req.params(":placa");
        int cilindrada = Integer.parseInt(req.params(":cilindrada"));

        Motocicleta motoNueva = new Motocicleta(cilindrada, marca, modelo, placa, (nuevaFecha.getHours() + ":" + nuevaFecha.getMinutes()));
        motos.add(motoNueva);

        return gson.toJson(motoNueva);
        });

        // Endpoint para obtener la lista de motocicletas actualizada
        get("/motos", (req, res) -> {
        res.type("application/json");
        return gson.toJson(motos);
        });

        //endpoint registrar hora de salida
        get("/registrarSalidaAutomovil/:placa", (req, res) -> {

            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // objeto fecha
            Date nuevaFecha = new Date();

            // Obtener parámetros de la URL
            String placa = req.params(":placa");

            // Buscar en automóviles
            for (Vehiculo automovil : automoviles) {
                if (automovil.getPlaca().equals(placa)) {
                    automovil.setHoraSalida((nuevaFecha.getHours() + ":" + nuevaFecha.getMinutes()));
                    return gson.toJson(automovil);
                }

            }
            return gson.toJson("Automovil no encontrado en el parqueadero");
        });

        get("/registrarSalidaMoto/:placa", (req, res) -> {

            res.type("application/json");

            Date nuevaFecha = new Date();
            
            String placa = req.params(":placa");

            for (Motocicleta motocicleta : motos) {
                if (motocicleta.getPlaca().equals(placa)) {
                    motocicleta.setHoraSalida((nuevaFecha.getHours() + ":" + nuevaFecha.getMinutes()));
                    return gson.toJson(motocicleta);
                }
            }
            return gson.toJson("Motocicleta no encontrada en el parqueadero");
        });

        get("/AutomovilesActuales", (req, res) -> {
            res.type("application/json");

            LinkedList<Vehiculo> automovilesActuales = new LinkedList<>();

            for (Vehiculo automovil : automoviles) {
                if (automovil.getHoraSalida() == null) {
                    automovilesActuales.add(automovil);
                }
            }

            return gson.toJson(automovilesActuales);
        });

        get("/motosActuales", (req, res) -> {
            res.type("application/json");

            LinkedList<Motocicleta> motosActuales = new LinkedList<>();

            for (Motocicleta motocicleta : motos) {
                if (motocicleta.getHoraSalida() == null) {
                    motosActuales.add(motocicleta);
                }
            }

            return gson.toJson(motosActuales);
        });

        get("/motosReporte", (req, res) -> {
            res.type("application/json");

            LinkedList<String> informeMotos = new LinkedList<>();
            for (Motocicleta m : motos) {
                informeMotos.add("Placa: " + m.getPlaca()
                        + ", Ganancia: " + m.calcularGanancias()
                        + ", Hora de Entrada: " + m.getHoraIngreso()
                        + ", Hora de Salida: " + m.getHoraSalida());
            }

            return new Gson().toJson(informeMotos);
        });

        get("/AutomovilesReporte", (req, res) -> {
            res.type("application/json");

            LinkedList<String> informeAutomoviles = new LinkedList<>();
            for (Vehiculo a : automoviles) {
                informeAutomoviles.add("Placa: " + a.getPlaca()
                        + ", Ganancia: " + a.calcularGanancias()
                        + ", Hora de Entrada: " + a.getHoraIngreso()
                        + ", Hora de Salida: " + a.getHoraSalida());
            }
            return new Gson().toJson(informeAutomoviles);
        });
        
        // Endpoint para obtener las ganancias totales de motocicletas
        get("/totalGananciasMotos", (req, res) -> {
        res.type("application/json");

        int totalGananciasMotos = 0;
        for (Motocicleta m : motos) {
            totalGananciasMotos += m.calcularGanancias();
        }

        return new Gson().toJson(totalGananciasMotos);
        });

        // Endpoint para obtener las ganancias totales de automóviles
        get("/totalGananciasAutomoviles", (req, res) -> {
        res.type("application/json");

        int totalGananciasAutomoviles = 0;
        for (Vehiculo a : automoviles) {
            totalGananciasAutomoviles += a.calcularGanancias();
        }

        return new Gson().toJson(totalGananciasAutomoviles);
        });

 
        get("/totalGananciasDia", (req, res) -> {
            res.type("application/json");


            double totalGananciasDia = 0;

            for (Motocicleta m : motos) {
                totalGananciasDia += m.calcularGanancias();
            }

            for (Vehiculo a : automoviles) {
                totalGananciasDia += a.calcularGanancias();
            }

            return new Gson().toJson(totalGananciasDia);
        });
    }
}



