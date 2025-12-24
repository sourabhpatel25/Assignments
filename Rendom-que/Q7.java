//update
class UpdateStudent {
    {
 try(Connection con  =  GetConnection.getConnection();){  
               Scanner sc=new Scanner (System.in);
               
               System.out.println("Enter id to update details");
               int id =sc.nextInt();
               
               System.out.println("Enter name");
               String name= sc.next();
              
               System.out.println("Enter subject");
               String subject=sc.next();
               
               System.out.println("Enter batch");
               int batch=sc.nextInt();
               
            System.out.println("");
            String sql = "update student set name = ?, subject=? ,batch=? where id=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1,name);
             ps.setString(2,subject);
             ps.setInt(3,batch);
             ps.setInt(4, id);

            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Inserted...");
            } else {
                System.out.println("not inserted...");
            }
             con.close();
                
        }catch(Exception e){
            System.err.println(e);
        }
          
    }
    
}
    
