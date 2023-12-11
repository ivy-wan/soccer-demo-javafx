module ia_demo.soccer {
    requires javafx.controls;
    requires transitive javafx.graphics;
    requires java.sql;
    exports demo.soccer;
    exports demo.soccer.coach;
    exports demo.soccer.league;
    exports demo.soccer.shared;
    exports demo.soccer.team;
}
