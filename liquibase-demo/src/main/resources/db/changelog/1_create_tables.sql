CREATE TABLE "school"(
    "id" UUID NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    "address" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "school" ADD PRIMARY KEY("id");

CREATE TABLE "user"(
    "id" UUID NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    "age" INTEGER NOT NULL,
    "surname" VARCHAR(255) NOT NULL,
    "school_id" UUID NOT NULL,
    FOREIGN KEY ("school_id") REFERENCES "school"("id")
);
ALTER TABLE
    "user" ADD PRIMARY KEY("id");

CREATE TABLE "post"(
    "id" UUID NOT NULL,
    "text" VARCHAR(255) NOT NULL,
    "user_id" UUID NOT NULL,
    FOREIGN KEY("user_id") REFERENCES "user"("id")
);
ALTER TABLE
    "post" ADD PRIMARY KEY("id");


CREATE TABLE "friends"(
    "user_id" UUID NOT NULL,
    "friend_id" UUID NOT NULL,
    FOREIGN KEY("user_id") REFERENCES "user"("id"),
    FOREIGN KEY("friend_id") REFERENCES "user"("id")
);
ALTER TABLE
    "friends" ADD PRIMARY KEY("user_id","friend_id");
