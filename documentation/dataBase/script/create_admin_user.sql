# Run this script just once!

# In this case is available a remote connection.
# CREATE USER 'ss_admin'@'%' IDENTIFIED BY 'admin_password';

# In this case is available only a local connection.
CREATE USER 'ss_admin'@'localhost' IDENTIFIED BY 'ss_admin_password';

GRANT ALL PRIVILEGES ON stairway_sounds. * TO 'ss_admin'@'localhost';