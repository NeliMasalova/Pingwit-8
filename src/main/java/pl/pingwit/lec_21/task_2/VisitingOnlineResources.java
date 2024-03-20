package pl.pingwit.lec_21.task_2;

public record VisitingOnlineResources(String userName, String siteName) {

    @Override
    public String toString() {
        return "VisitingOnlineResources{" +
                "userName='" + userName + '\'' +
                ", siteName='" + siteName + '\'' +
                '}';
    }
}
