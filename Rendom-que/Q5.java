//fatch data
class FetchStudent {
    {
    try(Connection con  =  GetConnection.getConnection();){  
               
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id for fetch details");
        int id =sc.nextInt();
           
            String sql = "Select * from student where id=? ";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,id);
              
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            String name =rs.getString("name");
            String subject = rs.getString("subject");
            int batch = rs.getInt("batch");
            System.out.println(name+" "+subject+" "+batch+" ");
    }
    }
    
    catch(Exception e){
            System.err.println(e);
        }
    }

   
}
