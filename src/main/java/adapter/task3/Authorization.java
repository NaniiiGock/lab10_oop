package adapter.task3;
public class Authorization {
    private Авторизація authorization = new Авторизація();
    public boolean authorization(Database db) {
        return authorization.авторизуватися(db.getБазаДаних());
    }
}
