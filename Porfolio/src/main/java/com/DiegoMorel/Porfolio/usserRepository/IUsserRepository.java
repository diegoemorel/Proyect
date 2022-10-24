
package com.DiegoMorel.Porfolio.usserRepository;

import com.DiegoMorel.Porfolio.usser.Usser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IUsserRepository extends JpaRepository<Usser,Long> {
    
}
