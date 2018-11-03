package fanxing;

public class Test {

/*    在Java SE 1.5之前，没有泛型的情况的下，通过对类型Object的引用来实现参数的“任意化”，“任意化”带来的缺点是要做显式的强制类型转换，而这种转换是要求开发者对实际参数类型可以预知的情况下进行的。对于强制类型转换错误的情况，编译器可能不提示错误，在运行的时候才出现异常，这是一个安全隐患。*/
    public static  class Map<K,V>
{
    public void put(K k,V v)
    {

    }
    public void get(K k)
    {

    }

}


}
