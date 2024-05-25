public class ConcretePrincipalCEO extends AbstractPrincipalCEO
{
    //atributo
    private String Director = "CEO";

    //constructores
    public ConcretePrincipalCEO(){}
    public ConcretePrincipalCEO(String director) {
        Director = director;
    }


    //get y set
    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }
    //método
    @Override
    public void showDirector() {
        getDirector();

    }
}
