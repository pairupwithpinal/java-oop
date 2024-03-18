public class Netflix {
    private int custoumerid;

    public String getTvshow() {
        return tvshow;
    }

    public void setTvshow(String tvshow) {
        this.tvshow = tvshow;
    }

    private String tvshow;
    private int customerage;

    public Netflix( int age) {

        this.customerage = age;
    }

    public int getCustumerid() {
        return custoumerid;
    }

    public void setCustumerid(int custumerid) {
        this.custoumerid = custumerid;
    }




    public int getAge() {
        return customerage;
    }

    public void setAge(int age) {
        this.customerage = age;
    }

    public void populartvshow() {
        if (customerage < 8) {
          tvshow = "Dora";

        } else if (customerage < 15) {
           tvshow = "Hunger Games";


        } else if (customerage < 50) {
           tvshow = "Friends";
        }else
            tvshow = "BBT";
    }

}