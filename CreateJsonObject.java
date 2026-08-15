import org.json.JSONObject;
public class CreateJsonObject {
  public static void main(String[] args) {
  // Create JSON object
  JSONObject student = new JSONObject();
    student.put("name", "KARTIK");
    student.put("age", 20);
    student.put("isStudent", true);
    student.put("course", "Computer Science");
    // Print formatted JSON
    System.out.println("Student JSON Object:");
    System.out.println(student.toString(4));
  }
}
