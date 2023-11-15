package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Candidate;
import utils.DBUtils;


public class CandidateDaoImpl implements CandidateDao {
	
	Connection cn ;
	PreparedStatement pst;
	
	
	public CandidateDaoImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		cn = DBUtils.openConnection();
		
		pst = cn.prepareStatement("select * from candidates");
	}

	@Override
	public List<Candidate> getAllCandidates() throws SQLException {
		
		List<Candidate> ans = new ArrayList<Candidate>();
		ResultSet rst = pst.executeQuery();
		
		while(rst.next()) {
			ans.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
		}
	   
		
		return ans;
	}
	

}
