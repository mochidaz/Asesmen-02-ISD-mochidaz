public class Participant implements Comparable<Participant> {
    public String rt;
    public String name;
    public int score;
    
    public Participant(String rt, String name, int score) {
        this.rt = rt;
        this.name = name;
        this.score = score;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 31;

        int rtHash = this.rt.hashCode();
        int nameHash = this.name.hashCode();
        int scoreHash = this.name.hashCode();

        int hash = HASH_MULTIPLIER * (rtHash + nameHash + scoreHash);

        return hash;
    }

    @Override
    public String toString() {
        return "Asal rt = " + this.rt + ", nama = " + this.name + ", nilai = " + this.score;
    }

    @Override
    public int compareTo(Participant p) {
        if (this.score < p.score) {
            return -1;
        } else if (this.score > p.score) {
            return 1;
        } else {
            return 0;
        }
    }
}