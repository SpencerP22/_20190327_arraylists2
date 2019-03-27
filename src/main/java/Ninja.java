public class Ninja implements Comparable<Ninja> {
    private String name;
    private int skill;

    //constructors
    public Ninja(String name, int skill) {
        setName(name);
        setSkill(skill);
    }

    public boolean isDangerous(){
        return skill > 5;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(int skill) {
        if (skill < 0) {
            this.skill = 0;
        } else {
            this.skill = skill;
        }
        this.skill = (skill > 10) ? 10 : skill;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        String result = String.format("Ninja %s has a skill level of %d", name, skill);
        if(isDangerous())
            result += " and is very dangerous!";
        return result;
    }

    public int compareTo(Ninja o) {
        int result = this.name.compareToIgnoreCase(o.name);
        if (result == 0) {
            result = this.skill - o.skill;
        }
        return result;

    }
}