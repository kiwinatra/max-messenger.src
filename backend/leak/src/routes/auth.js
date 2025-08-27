const express = require('express');
const { login } = require('../controllers/authController');
const { validateLogin } = require('../middleware/validation');
const router = express.Router();
router.post('/login', validateLogin, login);
module.exports = router;