Feature: Udemy

  Scenario: Udemy sitesine git ve arama yap
    Given Udemy Web Sitesine git
    When Arama kutucuguna tikla
    When Yazilim yaz ve ara
    Then Yazilim Kurslarinin Geldigini Kontrol Et