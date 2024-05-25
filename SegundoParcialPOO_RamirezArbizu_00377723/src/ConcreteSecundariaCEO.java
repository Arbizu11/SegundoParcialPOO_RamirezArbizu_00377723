public class ConcreteSecundariaCEO extends AbstractSecundario
{
    //atributo
    private String Director = "CEO";

    //constructores
    public ConcreteSecundariaCEO(){}
    public ConcreteSecundariaCEO(String director) {
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
