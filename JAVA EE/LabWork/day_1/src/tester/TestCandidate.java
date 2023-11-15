package tester;

import java.sql.SQLException;

import dao.CandidateDao;
import dao.CandidateDaoImpl;

public class TestCandidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			CandidateDao cd = new CandidateDaoImpl();
			cd.getAllCandidates().forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
