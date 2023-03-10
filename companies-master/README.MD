Project _Slovenian Companies_
-------------------

Web application for to display and edit buisness entities in Slovenia, with web map and spatial analysis.


## Modules:
- edit company info
    - basic data
    - code lists
- company list
    - show all companies
    - filter + search
    - paging
- add company:
    - form on web
    - manual import  

- geolocate companies
- geoserver setup
    - deployment
    - register layers
    - layer styles

- show companies on map:
    - icon style by type
    - identify :
        - with point: WMS/getFeatureInfo + GS template
        - with polygon: WFS/getFeature
    - analysis: 
        - heatmap
        - grid (http://gis.stat.si/)
        
        

## Database:

REPLACE username and password!!!

```xml
<?xml version='1.0' encoding='utf-8'?>
<Context>

    <Resource name="jdbc/companiesDB" auth="Container" type="javax.sql.DataSource"

              maxActive="4000"
              maxIdle="20"
              validationQuery="SELECT 1"
              testOnBorrow="true"
              suspectTimeout="60"
              timeBetweenEvictionRunsMillis="30000"
              minEvictableIdleTimeMillis="60000"
              logAbandoned="true"
              removeAbandonedTimeout="60"
              closeMethod="close"
              username="USER" password="PASSWORD"
              driverClassName="org.postgresql.Driver"
              url="jdbc:postgresql://localhost:5432/companies?autoReconnect=true&amp;useEncoding=true&amp;characterEncoding=UTF-8"/>


</Context>
```
    
## Enviroment :
### Development:
- Java 8
- PostgreSQL + Postgis (H2?)
- Apache Tomcat 8.5
- Geoserver (latest)
- Maven (latest) 
- Eclipse or Intellij
- Igea code formatter
- GIT (gitflow branching model)


### Java WebApp:
- Spring Security + custom RoleBasedAccessControl
- Spring MVC
    - JSTL/JSP
    - Apache Tiles
- Spring JDBCTemplate
- Log4J2
- Lombok
- JUnit 4


### Java WebApp frontend:
- Bootstrap 4 + jQuery
- Openlayers (latest) / later: IGEA GisView
- kasneje uvedemo: Thymeleaf










## Description of source files:
- http://datoteke.durs.gov.si/DURS_zavezanci_PO.zip
- http://datoteke.durs.gov.si/DURS_zavezanci_DEJ.zip


Seznam dav??nih zavezancev - pravne osebe
----------------------------------------
Datoteka je v UTF-8 (z vmesnimi presledki) s podatki:
1. stolpec: P       Ni pla??nik DDV na podlagi 76. a ??lena ZDDV-1
            O       Posebna ureditev - mednarodni ob??asni cestni prevoz potnikov
2. stolpec: *       zavezanost za DDV
3. stolpec:         dav??na ??tevilka zavezanca 
4. stolpec:         mati??na ??tevilka zavezanca
5. stolpec:         datum registracije za DDV
6. stolpec:         ??ifra dejavnosti
7. stolpec:         ime zavezanca
8. stolpec:         naslov zavezanca
9. stolpec:         finan??ni urad (Op1) 


Seznam dav??nih zavezancev - fizi??ne osebe, ki opravljajo dejavnost 
------------------------------------------------------------------
Datoteka je v UTF-8 (z vmesnimi presledki) s podatki: 
1. stolpec:         dav??na ??tevilka zavezanca 
2. stolpec:         mati??na ??tevilka zavezanca
3. stolpec:         ??ifra dejavnosti
4. stolpec:         ime zavezanca
5. stolpec:         naslov zavezanca
6. stolpec:         finan??ni urad (Op1) 

 
Seznam dav??nih zavezancev za DDV - fizi??ne osebe 
------------------------------------------------
Datoteka je v UTF-8 (z vmesnimi presledki) s podatki:
1. stolpec: P     Ni pla??nik DDV na podlagi 76. a ??lena ZDDV-1
            O     Posebna ureditev - mednarodni ob??asni cestni prevoz potnikov
2. stolpec:        dav??na ??tevilka zavezanca
3. stolpec:        ime in priimek zavezanca 
4. stolpec:        naslov zavezanca  
5. stolpec:        datum registracije za DDV 
6. stolpec:        finan??ni urad (Op1) 

 
Seznam zavezancev, katerim je bila preklicana identifikacija za DDV po uradni dol??nosti po 1. odstavku 80. ??lena ZDDV-1
-----------------------------------------------------------------------------------------------------------------------
1. stolpec:     dav??na ??tevilka,
2. stolpec:     datum pridobitve identifikacijske ??tevilke za DDV,
3. stolpec:     datum prenehanja identifikacije za namene DDV,
4. stolpec:     naziv,
5. stolpec:     sede?? 

 
Seznam zavezancev, katerim je bila preklicana identifikacija za DDV po uradni dol??nosti po 2. odstavku 80. ??lena ZDDV-1
-----------------------------------------------------------------------------------------------------------------------
1. stolpec:     dav??na ??tevilka,
2. stolpec:     datum pridobitve identifikacijske ??tevilke za DDV,
3. stolpec:     datum prenehanja identifikacije za namene DDV,
4. stolpec:     naziv,
5. stolpec:     sede?? 

 
(Op1) 
??ifrant finan??nih uradov:
02 ??? PFU
03 ??? FU Bre??ice
04 ??? FU Celje
05 ??? FU Ko??evje
06 ??? FU Koper
07 ??? FU Kranj
08 ??? FU Ljubljana
09 ??? FU Maribor
10 ??? FU Murska Sobota
11 ??? FU Nova Gorica
12 ??? FU Novo mesto
13 ??? FU Postojna
14 ??? FU Ptuj
15 ??? FU Hrastnik
16 ??? FU Velenje
21 ??? FU Dravograd
