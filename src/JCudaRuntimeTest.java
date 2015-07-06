import jcuda.*;
import jcuda.runtime.*;
public class JCudaRuntimeTest
{
    public static void main(String args[])
    {
        long start = System.currentTimeMillis();
        Pointer pointer = new Pointer();
        JCuda.cudaMalloc(pointer, 4);
        System.out.println("Pointer: " + pointer);
        JCuda.cudaFree(pointer);
        System.out.println(System.currentTimeMillis()-start);
    }
}