import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection(); //bağlantıyı açtık
            String sql = "update city set population=80000 where id=4082";
            statement = connection.prepareStatement(sql);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Güncellendii..");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        } finally {
            statement.close();
            connection.close();

        }

        public  void selectDemo() throws SQLException{
            Connection connection = null;
            DbHelper helper = new DbHelper();
            PreparedStatement statement = null;
            ResultSet resultSet;

            try {

                connection = helper.getConnection();
                statement = (PreparedStatement) connection.createStatement();
                resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
                ArrayList<Country> countries = new ArrayList<Country>();

                while (resultSet.next()) {
                    //System.out.println(resultSet.getString("Name"));
                    countries.add(new Country(
                            resultSet.getString("Code"),
                            resultSet.getString("Name"),
                            resultSet.getString("Continent"),
                            resultSet.getString("Region")));
                }
                System.out.println(countries.size());

            } catch (SQLException exception) {
                helper.showErrorMessage(exception);

            } finally {
                connection.close();

            }

        }
        public  void insertData(){
           connection = null;
          helper = new DbHelper();
           statement = null;

            try {

                connection = helper.getConnection(); //bağlantıyı açtık
                statement = connection.prepareStatement(" insert into city(Name,CountryCode,District,Population) values ('Düzce','TUR','Düzce',50000)");
                int result = statement.executeUpdate();
                System.out.println("Kayıt Eklendi..");

            } catch (SQLException exception) {
                helper.showErrorMessage(exception);

            } finally {
                statement.close();
                connection.close();

            }

        }














    }
    }


