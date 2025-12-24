//remove detils
class RemoveStudent {
    {
    try(Connection con  =  GetConnection.getConnection();){  
               
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id for remove details");
        int id =sc.nextInt();
           
            String sql = "delete from student where id=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,id);
              
          int rowDelet=ps.executeUpdate();
          
          if(rowDelet>0){
              System.out.println("Delete Succesfully");
          }else{
              System.out.println("Id not found");
          }
    }
    
    catch(Exception e){
            System.err.println(e);
        }
    }

   
}

