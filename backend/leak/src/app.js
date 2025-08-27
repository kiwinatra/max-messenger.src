// SLIV BY KIWINATRA


require('dotenv').config();
const connectDB = require('./config/database');
const { app, server } = require('./config/server');
const routes = require('./routes');
const PORT = process.env.PORT || 3000;
connectDB();
app.use('/api', routes);
require('./utils/socket');
server.listen(PORT, () => console.log(`Server running on port ${PORT}`));