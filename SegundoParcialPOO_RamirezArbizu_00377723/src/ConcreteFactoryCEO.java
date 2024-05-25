public class ConcreteFactoryCEO extends ConcretePrincipalCEO implements AbstractFactory
{
    @Override
    public void createDepartamentoPrincipalCEO()
    {
        System.out.println("Departamento Principal creado");
    }

    @Override
    public void createDepartamentoSecundarioCEO()
    {
        System.out.println("Departamento Secundario creado");
    }
}
