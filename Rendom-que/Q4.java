 //addstudent
 class AddStudent {
        // TODO code application logic here
        try(Connection con  =  GetConnection.getConnection();){  
               Scanner sc=new Scanner (System.in);
               System.out.println("Enter name");
               String name= sc.next();
               System.out.println("Enter id.");
               int id =sc.nextInt();
               System.out.println("Enter subject");
               String subject=sc.next();
               System.out.println("Enter batch");
               int batch=sc.nextInt();
               
            System.out.println("");
            String sql = "INSERT INTO student(name, id, subject, batch) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
             ps.setString(1, name);
             ps.setInt(2, id);
             ps.setString(3, subject);
             ps.setInt(4, batch);

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