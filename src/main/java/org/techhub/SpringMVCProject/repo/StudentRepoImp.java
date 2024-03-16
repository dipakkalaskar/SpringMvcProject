package org.techhub.SpringMVCProject.repo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.techhub.SpringMVCProject.model.Student;

@Repository("studentRepo")
public class StudentRepoImp implements StudentRepo {
    @Autowired
    JdbcTemplate Template;

    @Override
    public boolean isAddStudent(final Student s) {
        int val = Template.update("insert into mvcr values('0',?,?,?)", new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, s.getName());
                ps.setString(2, s.getEmail());
                ps.setString(3, s.getContact());
            }
        });

        // Check if insertion was successful
        if (val > 0) {
            return true;
        } else {
            return false;
        }
    }
}
