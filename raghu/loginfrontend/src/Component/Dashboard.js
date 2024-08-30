import React from 'react';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import IconButton from '@mui/material/IconButton';
import FavoriteIcon from '@mui/icons-material/Favorite';
import ShareIcon from '@mui/icons-material/Share';
import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import MenuIcon from '@mui/icons-material/Menu';

import { Button, CardActionArea, CardActions, Typography } from '@mui/material';

const Dashboard = () => {
    const cardData = [
        {
            id: 1,
            title: 'Yamaha R15',
            image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpJus3nCfKNmJZt9ASzl_3sprvcYVepZRS7w&s',
        },
        {
            id: 2,
            title: 'Creta',
            image: 'https://spn-sta.spinny.com/blog/20220228142605/ezgif.com-gif-maker-100-8.jpg?compress=true&quality=80&w=576&dpr=2.6',
        },
        {
            id: 3,
            title: 'Aeroplane',
            image: 'https://t3.ftcdn.net/jpg/00/01/47/28/360_F_1472821_kMjcU0El8NkcU0k7zNtlVTU0Fl8W2l.jpg',
        },
    ];

    return (
        <div>
            <AppBar position="static">
                <Toolbar>

                    <IconButton
                        size="large"
                        edge="start"
                        color="inherit"
                        aria-label="open drawer"
                        sx={{ mr: 2 }}
                    >
                        <MenuIcon />
                    </IconButton>
                    <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
                        Dashboard
                    </Typography>

                </Toolbar>
            </AppBar>
            <div style={{ display: 'flex', flexWrap: 'wrap', justifyContent: 'center', gap: '2rem', padding: '2rem' }}>
                {cardData.map((card) => (
                    <Card key={card.id} sx={{ height: '60%', width: '20%', marginTop: '3%' }}>
                        <CardActionArea>
                            <CardMedia
                                component="img"
                                height="150"
                                image={card.image}
                                alt={card.title}
                            />
                            <CardContent>
                                <Typography gutterBottom variant="h5" component="div">
                                    {card.title}
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    {card.description}
                                </Typography>
                            </CardContent>
                        </CardActionArea>
                        <CardActions>
                            <IconButton aria-label="add to favorites">
                                <FavoriteIcon />
                            </IconButton>
                            <IconButton aria-label="share">
                                <ShareIcon />
                            </IconButton>
                        </CardActions>
                    </Card>
                ))}
            </div>
        </div>
    );
};

export default Dashboard;
