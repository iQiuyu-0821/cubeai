import { Routes } from '@angular/router';

import { ErrorComponent } from './error.component';

export const errorRoutes: Routes = [
    {
        path: 'error',
        component: ErrorComponent,
        data: {
            authorities: [],
            pageTitle: '出错啦......'
        },
    },
    {
        path: 'accessdenied',
        component: ErrorComponent,
        data: {
            authorities: [],
            pageTitle: '未登录或登录已超时，请重新登录......',
            error403: true
        },
    }
];
