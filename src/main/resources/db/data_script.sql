insert into location_type values(1, "LIVE");
insert into location_type values(2, "ONLINE");

insert into visitor_rating_property values(1, "Host", "Rate host's hospitality", 1, 5);
insert into visitor_rating_property values(2, "Location", "Rate location", 1, 5);
insert into visitor_rating_property values(3, "Topic", "Rate how entertaining topic was", 1, 5);
insert into visitor_rating_property values(4, "Knowledge", "Rate acquired knowledge from conference ", 1, 10);
insert into visitor_rating_property values(5, "Link stability", "How stable your stream was", 1, 10);
insert into visitor_rating_property values(6, "Lunch", "How good was food? :)", 0, 5);

insert into event_type values(1, "Class");
insert into event_type values(2, "Meetup");
insert into event_type values(3, "Presentation");
insert into event_type values(4, "Workshop");

insert into user values(1, "markom", "$2a$12$ALIyju8Krm0GNF1mNZqzuuwVkxvBJFJOvQCmiAer.aBKFTGkl/UEK", "Marko", "Markovic", 1);

insert into country values(1, "Republic of Srpska");
insert into country values(2, "Serbia");
insert into country values(3, "Russia");
insert into country values(4, "Greece");
insert into country values(5, "Germany");
insert into country values(6, "Austria");
insert into country values(7, "Switzerland");
insert into country values(8, "Netherlands");
insert into country values(9, "Italia");
insert into country values(10, "Spain");
insert into country values(11, "Portugal");
insert into country values(12, "France");
insert into country values(13, "Poland");
insert into country values(14, "Slovakia");
insert into country values(15, "Bulgaria");
insert into country values(16, "Romania");
insert into country values(17, "United Kingdom");
insert into country values(18, "Belgium");
insert into country values(19, "Czech Republic");

insert into city values(1, "Banja Luka", 1);
insert into city values(2, "Belgrade", 2);

insert into location values(1, "Banski Dvor", 1, "Centar", "Main room", 1, 1);
insert into location values(2, "ConferenceOnline", 1, "www.conferences.com", "/live", null, 2);
