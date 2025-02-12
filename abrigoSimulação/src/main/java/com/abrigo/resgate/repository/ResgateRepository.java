package com.abrigo.resgate.repository;

interface ResgateRepository extends JpaRepository<Resgate, Long> {
    List<Resgate> findByDataResgateBetween(LocalDate start, LocalDate end); {

}
