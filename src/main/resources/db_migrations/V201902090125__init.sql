create table item (
  id bigserial primary key NOT NULL,
  name varchar(255) not null ,
  rating integer,
  location varchar(255),
  price real not null,
  imageUrl varchar(3000) null,
  description varchar(3000) null
);

create table recommendations (
  id bigint NOT NULL,
  recommendationId bigint NOT NULL
);


-- CREATE DATA

insert into item (id, name, rating, location, price, imageurl, description) VALUES
   (100, 'Stroller', 4, 'Estonia, Tallinn', '15', 'https://images-na.ssl-images-amazon.com/images/I/815QJm6AQLL._SY355_.jpg', 'Having a baby doesn’t have to mean giving up your active lifestyle. With the Zoom 360 jogging stroller, you can get out, get some exercise, and ensure your baby is never left out of the fun. The Zoom 360’s extra large tires were built to conquer a variety of terrains, but its slim design and budget-friendly price tag means it’s not going to consume your trunk or your wallet.

Weighs just 26 lbs
Locking and swiveling front tires
Extra-large air-filled tires for a smooth ride
Super easy one-handed fold
Use it with your car seat with optional adapter
From 3 months to 75 lbs
Includes parent organizer
Includes air pump'),
   (102, '2, Twin stroller', 5, 'Estonia, Tallinn', '20', 'https://images-na.ssl-images-amazon.com/images/I/815QJm6AQLL._SY355_.jpg', 'Baby Trend - Sit N Stand Plus Double Stroller, Millennium'),
   (103, 'Trio 3 Passenger Stroller', 4, 'Spain, Barcelona', '16', 'https://www.earlyyearsresources.co.uk/images/trio-3-passenger-stroller-p49320-863992_medium.jpg', 'Striking the perfect balance of strength and mobility, the Trio 3 Passenger Stroller is constructed of durable tubing that is light weight and easily manoeuvred. Fitted with a five point adjustable harness that allows 3 height positions to accommodate differently sized children weighing up to 40 pounds each.

The slim line shape fits through standard doorways allowing the stroller to be easily loaded in and out. Heavy duty rubberized foam wheels provide the same shock absorbing comfort of air filled wheels and can be securely parked using the foot brake. With handy under storage basket. Supplied complete with canopies and from September 2017 a raincover. Quick fold for easy storage.

Available Red/Black, Lime/Black or Orange/Black

Dimensions: Folded - L 124cm x W 53cm x H52cm Open - L149cm x W53cm x H104cm Assembled Weight - 25kg'),
   (104, '3 wheel stroller', 5, 'Estonia, Tallinn', '12', 'https://cdn.bigcommerce.com/s-f3rn5p/images/stencil/1280x1280/products/1768/8053/RF_Red_Zoom360__25035.1442005002.jpg?c=2&imbypass=on', 'Lightweight Baby Stroller with Carry Handle – Silver Frame and Blue Stripes – Lightweight Travel Stroller – Stylish Umbrella'),
   (105, 'Duo stroller', 4, 'Spain, Barcelona', '17', 'https://www.lacasadelbebe.it/media/catalog/product/b/u/bugaboo-donkey-duo-fratellare-per-2-bambini-di-eta-diverse-2017-telaio-alluminio-colore-rosso-cercapasseggini.jpg', 'More adventures, more things to bring on your stroll, and even more children. The name Donkey says it all: it''s the Bugaboo stroller with the most storage space. Plus, it can easily transform into a double stroller for your infant and toddler.'),

   (205, 'Baby carrier', 5, 'Spain, Barcelona', '8', 'https://n.nordstrommedia.com/id/15f714df-1b71-4801-9564-159ff00c60d8.jpeg', 'Front-facing limit is 10kg.
Recommended for infants from 3 kg. to 20 kg.; no infant insert needed.
Adjustable shoulder, waist and chest straps
Four convenient carry positions: front-inward, front-outward, hip and back
UPF 50+ tuck-away hood
100% cotton
Machine washable'),

   (206, 'Portable baby travel bed', 5, 'Spain, Barcelona', '11', 'https://i.ebayimg.com/images/g/uzoAAOSwdTJaWL6l/s-l1600.jpg', 'Total dimensions (LxWxH): 132 x 75 x 104 cm
Bed size (LxWxH): 128 x 67 x 81 cm
Surface area (LxW): 119 x 63 cm
Height of surface - bedside: 34 / 62 cm
Thickness mattress: 1.5 cm
Changing mat: length 68 cm, width 51 cm
Zipper entry: height 40 cm, width 47 cm
Dimensions when folded (LxWxH): 77 x 23 x 23 cm
Weight approx. 11.4 kg
Material: 100% polyester');


INSERT INTO recommendations (id, recommendationId) VALUES
  (100, 205),
  (101, 205),
  (102, 205),
  (103, 205),
  (104, 205),

  (100, 206),
  (101, 206),
  (102, 206),
  (103, 206),
  (104, 206),
  (105, 206)
;
