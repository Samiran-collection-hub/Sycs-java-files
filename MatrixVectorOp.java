import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;

public class MatrixVectorOp {
    static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_PREFERRED;
    public static void main(String[] args) {
        float[] a = {1.0f, 2.0f, 3.0f, 4.0f},b = {5.0f, 6.0f, 7.0f, 8.0f};
        float[] result = new float[4];
        for (int i = 0; i < a.length; i += SPECIES.length()) {
            var va = FloatVector.fromArray(SPECIES, a, i);
            var vb = FloatVector.fromArray(SPECIES, b, i);
            var vc = va.add(vb); 
            vc.intoArray(result, i);
        }
        System.out.println("Result: " + java.util.Arrays.toString(result));
    }
}
