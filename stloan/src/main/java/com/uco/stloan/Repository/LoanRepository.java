package com.uco.stloan.Repository;

import com.uco.stloan.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long> {
   /* @Query("SELECT li.article FROM Loan l JOIN l.loanItems li WHERE l.personUser = :userId AND li.article.status = :status")
    List<Article> findLoanedArticlesByUserIdAndStatus(Long userId, ArticleStatus status);
*/
@Query(value = "SELECT * FROM LOAN WHERE REF=?",nativeQuery = true )
    public Loan findLoanAticlesByUser(String identification);
}
