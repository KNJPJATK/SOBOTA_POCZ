public class EnumsInAction {
    public static void main(String[] args) {
        StanyAplikacji s = StanyAplikacji.RUNNING;

        switch (s) {
            case RUNNING:
                break;
            case NOT_RESPONDING:
                break;
            case LOADING:
                break;
        }
    }
}
