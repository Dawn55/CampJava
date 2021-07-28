package kodlamaio.hrms.core.utilities.adapters.validation.concretes;

import java.rmi.RemoteException;
import java.util.Locale;

import kodlamaio.hrms.core.utilities.adapters.validation.abstracts.CustomerCheckService;
import kodlamaio.hrms.entities.concretes.Employee;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkforperson(Employee employee) {
		boolean result= false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
		result =client.TCKimlikNoDogrula(Long.parseLong(employee.getNationalIdentity()), 
					employee.getFistName().toUpperCase(new Locale("tr")), employee.getLastName().
					toUpperCase(new Locale("tr")),employee.getYearOfBirth() );
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	    return result;
	    
	}

	
}
