//package com.postgresql.demotg.repo;
//
//import com.postgresql.demotg.model.Teams;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface TeamRepo extends JpaRepository<Teams, Long> {
//}
package com.postgresql.demotg.repo;

import com.postgresql.demotg.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Teams, Long> {
}
