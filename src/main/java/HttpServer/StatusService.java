package HttpServer;

public class StatusService {
    @Service
    public static String status(){
        return "Service status: OK";
    }
}
