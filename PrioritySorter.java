import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PrioritySorter {
    private PriorityQueue<Participant> participantQueue;
    private List<Integer> hashedParticipants;

    public PrioritySorter() {
        this.participantQueue = new PriorityQueue<>();
        this.hashedParticipants = new LinkedList<>();
    }

    public void insertData(String rt, String name, int score) {
        Participant p = new Participant(rt, name, score);
        this.participantQueue.add(p);
        this.hashedParticipants.add(p.hashCode());
    }

    public boolean searchData(String rt, String name, int score) {
        Participant p = new Participant(rt, name, score);
        return this.hashedParticipants.contains(p.hashCode());
    }

    public void printParticipants() {
        PriorityQueue<Participant> secondQueue = new PriorityQueue<>();

        Participant winner = null;

        while (!participantQueue.isEmpty()) {
            Participant data = participantQueue.poll();
            secondQueue.add(data);
            System.out.println(data);
            if (participantQueue.isEmpty()) {
                winner = data;
            }
        }

        if (winner != null) {
            System.out.println("Pemenang");
            System.out.println(winner);
        }

        this.participantQueue = secondQueue;
    }
}
