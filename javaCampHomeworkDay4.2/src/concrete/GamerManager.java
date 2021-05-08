package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Welcome! " + gamer.getNickName() + ". Your authentication was successful.");
		}else {
			System.out.println("Authentication failed.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Welcome! " + gamer.getNickName() + ". Your information has been updated.");
		}else {
			System.out.println("Update failed!");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("User " + gamer.getNickName() + " deleted.");
		
	}

}
