/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 5/31/13
 * Time: 1:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {

    public int add(String... s) {
        int lengths= s.length;
        int sum=0;

        for (int j=0; j<lengths; j++)
        {
            String cur[] = s[j].split("[,\n]");
            for(int i=0; i<cur.length; i++){
                if (!cur[i].isEmpty())
                    sum=sum+Integer.parseInt(cur[i]);
            }

        }
        return sum;

    }

    int doSum1(String st)
    {
        int sumM =0;
        String cur[] = st.split("[\n,]");
        for(int i =0; i< cur.length; i++)
            sumM=sumM+ Integer.parseInt(cur[i]);
        return sumM;
    }
}
