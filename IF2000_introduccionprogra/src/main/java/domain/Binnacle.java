package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Binnacle {

    private static long counter = 0;
    private List<LogEntry> logs = new ArrayList<>();

    public static class LogEntry {
        private final long idEvento;
        private final String event;
        private final LocalDateTime date;
        private final String accountInfo;

        public LogEntry(String event, Account account) {
            this.idEvento = ++counter;
            this.event = event;
            this.date = LocalDateTime.now();
            this.accountInfo = account.toString();
        }

        @Override
        public String toString() {
            return "ID: " + idEvento +
                    ", Event: " + event +
                    ", Date: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) +
                    "\nAccount Info:\n" + accountInfo;
        }
    }

    public void addLog(String event, Account account) {
        logs.add(new LogEntry(event, account));
    }

    public List<LogEntry> getLogs() { return logs; }
}

