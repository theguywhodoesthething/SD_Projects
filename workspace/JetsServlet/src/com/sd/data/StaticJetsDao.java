package com.sd.data;

import java.util.ArrayList;
import java.util.List;

public class StaticJetsDao implements JetsDao {

	private List<Jet> jets;
	
	public StaticJetsDao() {
		jets = new ArrayList<>();
		initJets();
	}
	
	private int id = 1;
	
	public void initJets(){
		jets.add(createJet("SR-71", 2000, 3000, 30_000_000));
		jets.add(createJet("F-16", 850, 900, 12_000_000));
		jets.add(createJet("ShootyBoomy", 600, 1200, 14_000_000));
	}
	
	private Jet createJet(String model, int speed, int range, int cost){
		return new Jet(id++, model, speed, range, cost);
	}
	
	@Override
	public List<Jet> getJets() {
		return jets;
	}

	@Override
	public Jet getJetById(int id) {
		for(Jet j : jets){
			if(j.getId() == id){
				return j;
			}
		}
			
		return null;
	}

}
