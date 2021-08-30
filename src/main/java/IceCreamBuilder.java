public class IceCreamBuilder
{
    private IceCream iceCream;

    public IceCreamBuilder()
    {
        iceCream = new IceCream();
    }

    public IceCream build()
    {
        if (iceCream.getSize() == "Grande")
            throw new IllegalArgumentException("Size not available!");
        else
            return iceCream;
    }

    public IceCreamBuilder setName(String name)
    {
        iceCream.setName(name);
        return this;
    }

    public IceCreamBuilder setSize(String size)
    {
        iceCream.setSize(size);
        return this;
    }

    public IceCreamBuilder setChocolateSauce(boolean chocolateSauce)
    {
        iceCream.setChocolateSauce(chocolateSauce);
        return this;
    }

    public IceCreamBuilder setFruit(boolean fruit)
    {
        iceCream.setFruit(fruit);
        return this;
    }

    public IceCreamBuilder setSugar(boolean sugar)
    {
        iceCream.setSugar(sugar);
        return this;
    }
}
