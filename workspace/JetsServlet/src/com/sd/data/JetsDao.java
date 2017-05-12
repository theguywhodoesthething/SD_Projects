package com.sd.data;

import java.util.List;

public interface JetsDao {
	List<Jet> getJets();
	Jet getJetById(int id);
}
