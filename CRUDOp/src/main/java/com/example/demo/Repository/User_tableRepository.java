
package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.User_table;
@Repository
public interface User_tableRepository extends JpaRepository<User_table, Integer>{

}
