package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.stuen;
import util.BaseDao;

public class StuDao extends BaseDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public List<stuen> getall(){
		List<stuen> list = new ArrayList<stuen>();
		conn = getConnection();
		try {
			String sql = "SELECT * FROM stu";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new stuen(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(rs, pst, conn);
		}
		return list;
	}
	public void Addinfo(int id,String name,int age) {
		try {
			conn=getConnection();
			String sql="INSERT INTO stu VALUE("+id+",'"+name+"',"+age+")";
			pst=conn.prepareStatement(sql);
//			pst.setInt(1, id);
//			pst.setString(2, name);
//			pst.setInt(3, age);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
