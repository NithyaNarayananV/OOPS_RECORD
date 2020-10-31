import java.util.* ;
class employee
{
    int empid ;
    long mobile ;
    String name,  address,  mailid ;
    Scanner get  =  new Scanner ( System.in) ;
    void getdata ( )
    {
        
        System.out.print (  "\n\n Employee Name     : " ) ;
        name        =  get.nextLine ( ) ;
        System.out.print (  " Mail id           : " ) ;
        mailid      =  get.nextLine ( ) ;
        System.out.print (  " Address           : " ) ;
        address     =  get.nextLine ( ) ;
        System.out.print (  " Employee id       : " ) ;
        empid       =  get.nextInt ( ) ;
        System.out.print (  " Mobile Number     : " ) ;
        mobile      =  get.nextLong ( ) ;
        System.out.print (  " Enter basic pay   : " ) ;
    }
}
class programmer extends employee
{
    double salary, bp, da, hra, pf, club, net, gross ;
    void calsalary ()
    {
        bp       =  get.nextDouble ( ) ;   
        da       =  ( 0.97*bp) ;
        hra      =  ( 0.10*bp) ;
        pf       =  ( 0.12*bp) ;
        club     =  ( 0.1*bp) ;
        gross    =  ( bp + da + hra) ;
        net      =  ( gross-pf-club) ;
        System.out.println (  "\n  ***************************** " ) ;
        System.out.println (  " PAY SLIP FOR PROGRAMMER " ) ;
        System.out.println (  " ***************************** " ) ;
        System.out.println (  " Basic Pay   : Rs "  + bp) ;
        System.out.println (  " DA          : Rs "  + da) ;
        System.out.println (  " PF          : Rs "  + pf) ;
        System.out.println (  " HRA         : Rs "  + hra) ;
        System.out.println (  " CLUB        : Rs "  + club) ;
        System.out.println (  " GROSS PAY   : Rs "  + gross) ;
        System.out.println (  " NET PAY     : Rs "  + net) ;
        System.out.println (  " *****************************\n\n " ) ;
    }
}	
class asstprofessor extends employee
{
    double salary, bp, da, hra, pf, club, net, gross ;
    void calsalary ()
    {
        bp       =  get.nextDouble ( ) ;   
        da       =  ( 0.97*bp) ;
        hra      =  ( 0.10*bp) ;
        pf       =  ( 0.12*bp) ;
        club     =  ( 0.1*bp) ;
        gross    =  ( bp + da + hra) ;
        net      =  ( gross-pf-club) ;
        System.out.println (  "\n  ***************************** " ) ;
        System.out.println (  " PAY SLIP FOR ASSISTANT PROFESSOR " ) ;
        System.out.println (  " ***************************** " ) ;
        System.out.println (  " Basic Pay   : Rs "  + bp) ;
        System.out.println (  " DA          : Rs "  + da) ;
        System.out.println (  " PF          : Rs "  + pf) ;
        System.out.println (  " HRA         : Rs "  + hra) ;
        System.out.println (  " CLUB        : Rs "  + club) ;
        System.out.println (  " GROSS PAY   : Rs "  + gross) ;
        System.out.println (  " NET PAY     : Rs "  + net) ;
        System.out.println (  " *****************************\n\n " ) ;
    }
}
class associateprofessor extends employee
{
    double salary, bp, da, hra, pf, club, net, gross ;
    void calsalary ()
    {
        bp       =  get.nextDouble ( ) ;   
        da       =  ( 0.97*bp) ;
        hra      =  ( 0.10*bp) ;
        pf       =  ( 0.12*bp) ;
        club     =  ( 0.1*bp) ;
        gross    =  ( bp + da + hra) ;
        net      =  ( gross-pf-club) ;
        System.out.println (  "\n ***************************** " ) ;
        System.out.println (  " PAY SLIP FOR ASSOCIATE PROFESSOR " ) ;
        System.out.println (  " ***************************** " ) ;
        System.out.println (  " Basic Pay   : Rs "  + bp) ;
        System.out.println (  " DA          : Rs "  + da) ;
        System.out.println (  " PF          : Rs "  + pf) ;
        System.out.println (  " HRA         : Rs "  + hra) ;
        System.out.println (  " CLUB        : Rs "  + club) ;
        System.out.println (  " GROSS PAY   : Rs "  + gross) ;
        System.out.println (  " NET PAY     : Rs "  + net) ;
        System.out.println (  " *****************************\n\n " ) ;
    }
}
class professor extends employee
{
    double salary, bp, da, hra, pf, club, net, gross ;
    void calsalary ()
    {
        bp       =  get.nextDouble ( ) ;   
        da       =  ( 0.97*bp) ;
        hra      =  ( 0.10*bp) ;
        pf       =  ( 0.12*bp) ;
        club     =  ( 0.1*bp) ;
        gross    =  ( bp + da + hra) ;
        net      =  ( gross-pf-club) ;
        System.out.println (  "\n  ***************************** " ) ;
        System.out.println (  " PAY SLIP FOR PROFESSOR " ) ;
        System.out.println (  " ***************************** " ) ;
        System.out.println (  " Basic Pay   : Rs "  + bp) ;
        System.out.println (  " DA          : Rs "  + da) ;
        System.out.println (  " PF          : Rs "  + pf) ;
        System.out.println (  " HRA         : Rs "  + hra) ;
        System.out.println (  " CLUB        : Rs "  + club) ;
        System.out.println (  " GROSS PAY   : Rs "  + gross) ;
        System.out.println (  " NET PAY     : Rs "  + net) ;
        System.out.println (  " *****************************\n\n " ) ;
    }
}
class salary
{
    public static void main ( String args[])
    {
        int choice;//, cont ;
        System.out.println (  "\n\n  PAYROLL " ) ;
        System.out.print (  "  1.PROGRAMMER \t 2.ASSISTANT PROFESSOR 
        \t 3.ASSOCIATE PROFESSOR \t 4.PROFESSOR : " ) ;
        Scanner c  =  new Scanner ( System.in) ;			
        choice = c.nextInt ( ) ;
        switch ( choice)
        {
            case 1:
            {
                programmer p = new programmer ( ) ;	
                p.getdata ( ) ;
                p.calsalary ( ) ; 
                break ;	
            }
            case 2:
            {
                asstprofessor asst = new asstprofessor ( ) ;	
                asst.getdata ( ) ;
                asst.calsalary ( ) ; 
                break ;
            }              
            case 3:
            {
                associateprofessor asso = new associateprofessor ( ) ;	
                asso.getdata ( ) ;
                asso.calsalary ( ) ; 
                break ;
            }
            case 4:
            {
                professor prof = new professor ( ) ;	
                prof.getdata ( ) ;
                prof.calsalary ( ) ; 
                break ;
            }
        }            
    }
}