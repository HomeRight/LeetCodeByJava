import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class java_stream_test {
    public static void main(String[] args) {
        List<testModel> tests = new ArrayList<>();
        testModel testModel1 = new testModel();
        testModel1.setProdSpecId(1);
        testModel1.setArrayGroupId(1);
        tests.add(testModel1);
        testModel testModel2 = new testModel();
        testModel2.setProdSpecId(1);
        testModel2.setArrayGroupId(1);
        tests.add(testModel2);
        testModel testModel3 = new testModel();
        testModel3.setProdSpecId(1);
        testModel3.setArrayGroupId(2);
        tests.add(testModel3);
        testModel testModel4 = new testModel();
        testModel4.setProdSpecId(1);
        testModel4.setArrayGroupId(2);
        tests.add(testModel4);

        Set<Integer> show = tests.stream().map(c -> c.getArrayGroupId()).collect(Collectors.toSet());

        System.out.println(show.size());


        List<testModel> shows = tests.stream().filter(c -> c.getArrayGroupId() == 1).collect(Collectors.toList());
        for (testModel sho : shows) {
            System.out.println(sho.getArrayGroupId());
            System.out.println(sho.getProdSpecId());
        }
    }
}

class testModel {
    Integer prodSpecId;
    Integer arrayGroupId;

    public Integer getProdSpecId() {
        return prodSpecId;
    }

    public void setProdSpecId(Integer prodSpecId) {
        this.prodSpecId = prodSpecId;
    }

    public Integer getArrayGroupId() {
        return arrayGroupId;
    }

    public void setArrayGroupId(Integer arrayGroupId) {
        this.arrayGroupId = arrayGroupId;
    }
}
