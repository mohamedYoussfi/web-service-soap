package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEutoToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11.3;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*80000, new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random()*80000, new Date()),
                new Compte(2, Math.random()*80000, new Date()),
                new Compte(3, Math.random()*80000, new Date())
        );
    }
}
