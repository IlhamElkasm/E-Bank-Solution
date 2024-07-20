import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { CempteComponent } from './components/cempte/cempte.component';
import { ComptecreateComponent } from './components/comptecreate/comptecreate.component';

const routes: Routes = [
  {path: "register", component: RegisterComponent },
  {path: "login", component: LoginComponent},
  {path: "compte", component: CempteComponent},
  {path: "Ajotercompte", component: ComptecreateComponent},
  {path: "dashboard", component: DashboardComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
