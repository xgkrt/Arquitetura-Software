package observe;

import enums.Status;

public interface Observer {
    void update (Status status);
}
